package com.isusucre.orientador_tecnologico.service;

import com.isusucre.orientador_tecnologico.model.AreaTecnologica;
import org.springframework.stereotype.Service;

@Service
public class OrientadorServiceImpl implements OrientadorService {
    @Override
    public AreaTecnologica leerOpcionElegida(int opcion, String plataforma) {
        switch (opcion) {
            case 1:
                if("frontend".equalsIgnoreCase(plataforma)){
                    return new AreaTecnologica(
                        "Desarrollo Web Frontend",
                        "HTML: estructura de una página web, CSS: estilo y diseño, JavaScript: interactividad, React: librería para interfaces de usuario, Angular: framework para aplicaciones web",
                        "Ruta de aprendizaje en Desarrollo Web Frontend",
                        "Visual Studio Code, GitHub, Chrome DevTools",
                        "desarrolloWeb(Frontend).pdf"
                    );
                } else if ("backend".equalsIgnoreCase(plataforma)) {
                    return new AreaTecnologica(
                        "Desarrollo Web Backend",
                        "Java: lenguaje de programación, Python: lenguaje de programación, Node.js: entorno de ejecución, SQL: lenguaje de consulta para bases de datos",
                        "Ruta de aprendizaje en Desarrollo Web Backend",
                        "IntelliJ IDEA, PyCharm, Postman",
                        "desarrolloWeb(Backend).pdf"
                    );
                } else {
                    return new AreaTecnologica(
                        "Desarrollo Web Full Stack",
                        "HTML: estructura de una página web, CSS: estilo y diseño, JavaScript: interactividad, React: librería para interfaces de usuario, Angular: framework para aplicaciones web, Java: lenguaje de programación, Python: lenguaje de programación, Node.js: entorno de ejecución, SQL: lenguaje de consulta para bases de datos",
                        "Ruta de aprendizaje en Desarrollo Web Full Stack",
                        "Visual Studio Code, IntelliJ IDEA, Postman",
                        "desarrolloWeb(FullStack).pdf"
                    );
                }
            case 2:
                return new AreaTecnologica(
                    "Ciencia de Datos",
                    "Python: lenguaje de programación, R: lenguaje de programación, SQL: lenguaje de consulta para bases de datos, TensorFlow: librería para aprendizaje automático",
                    "1. Aprende Python o R\n2. Domina SQL para manejo de datos\n3. Explora bibliotecas como TensorFlow o Scikit-learn\n4. Trabaja en proyectos de análisis de datos",
                    "Jupyter Notebook, Anaconda, Tableau",
                    "dataScience.pdf"
                );
            case 3:
                if("ios".equalsIgnoreCase(plataforma)){
                    return new AreaTecnologica(
                        "Desarrollo Movil (iOS)",
                        "Swift, Objective-C, SwiftUI",
                        "Ruta de aprendizaje en Desarrollo Móvil iOS",
                        "Xcode, Swift Playgrounds",
                        "desarrolloMovilIOS.pdf"
                    );
                } else {
                    return new AreaTecnologica(
                        "Desarrollo Movil (Android)",
                        "Java, Kotlin, Swift, Flutter",
                        "Ruta de aprendizaje en Desarrollo Móvil Android",
                        "Android Studio, Xcode, Flutter SDK",
                        "desarrolloMovilAndroid.pdf"
                    );  
                }
            case 4:
                return new AreaTecnologica(
                    "Backend",
                    "Java, Python, Node.js, SQL",
                    "1. Aprende un lenguaje de backend como Java, Python o Node.js\n2. Domina bases de datos SQL\n3. Explora frameworks como Spring Boot o Express.js\n4. Construye APIs y servicios backend",
                    "IntelliJ IDEA, PyCharm, Postman",
                    "backend.pdf"
                );
            default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
                return null;
        }
    }
}
