
package utils;

import java.util.Collections;
import java.util.Date;
import org.springframework.util.Base64Utils;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtils {
   
// 2. Aquí llamamos al paquete de cifrado base64 de springboot para encriptar una cadena, porque la desencriptaremos más tarde, así que la colocamos fuera
    private static final byte[] KEY = Base64Utils.encode("Lanou3g".getBytes());

    // 3. Personaliza un método para que solo necesitemos pasar la identificación de usuario ahora, y el tiempo es automáticamente 3600 segundos (media hora)
    // Si necesita definir el tiempo usted mismo, simplemente ajuste el método 1.
    public static String newToken(Long id){
        return newToken(id,10);
    }

    // 1. Crear una identificación de usuario variable, tiempo de caducidad segundos 3600
    public static String newToken(Long id,long seconds){


        String token = Jwts.builder() // Método del constructor
                .setId(String.valueOf(id)) // Especifica el valor de id
                .setExpiration(new Date(System.currentTimeMillis() + seconds * 1000))// Especificar tiempo de vencimiento
                .addClaims(Collections.singletonMap("duration",seconds))
                .signWith(SignatureAlgorithm.HS256,KEY)// Especifique el algoritmo y la clave para la firma (cadena cifrada base64)
                .compact();

        return token;
    }

// 4. Saca la identificación (identificación del usuario) del token
    // Cuando necesite prestar atención, este método generará una excepción cuando el token no se pueda resolver (como un token falso, un token caducado)
    public static Long getId(String token){
        // Reclamaciones es la carga, que es la segunda parte del token. En otras palabras, obtenemos su carga
        Claims claims = (Claims) Jwts.parser()
                .setSigningKey(KEY)
                .parse(token)
                .getBody();

        String id =claims.getId();

        return Long.parseLong(id);
    }


// El usuario inicia sesión, se genera un token en segundo plano y el token se devuelve al usuario
// El usuario lleva el token en cada solicitud y lo pasa al fondo para su verificación
// Después de la verificación de antecedentes, coloque el token en el encabezado de respuesta y devuélvalo al usuario
// El usuario saca el token del encabezado de respuesta y actualiza el caché local
 
}
