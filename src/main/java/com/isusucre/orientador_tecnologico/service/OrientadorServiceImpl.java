package com.isusucre.orientador_tecnologico.service;

import com.isusucre.orientador_tecnologico.model.AreaTecnologica;

public class OrientadorServiceImpl implements OrientadorService {
    @Override
    public AreaTecnologica leerOpcionElegida(int opcion) {
        switch (opcion) {
            case 1:
                return new AreaTecnologica(
                    "Desarrollo Web",
                    "HTML, CSS, JavaScript, React, Angular",
                    "1. Aprende HTML y CSS\n2. Domina JavaScript\n3. Explora frameworks como React o Angular\n4. Construye proyectos prácticos",
                    "Visual Studio Code, GitHub, Chrome DevTools"
                );
            case 2:
                return new AreaTecnologica(
                    "Ciencia de Datos",
                    "Python, R, SQL, TensorFlow",
                    "1. Aprende Python o R\n2. Domina SQL para manejo de datos\n3. Explora bibliotecas como TensorFlow o Scikit-learn\n4. Trabaja en proyectos de análisis de datos",
                    "Jupyter Notebook, Anaconda, Tableau"
                );
            case 3:
                return new AreaTecnologica(
                    "Desarrollo Móvil",
                    "Java, Kotlin, Swift, Flutter",
                    "1. Aprende Java o Kotlin para Android\n2. Aprende Swift para iOS\n3. Explora Flutter para desarrollo multiplataforma\n4. Crea aplicaciones móviles prácticas",
                    "Android Studio, Xcode, Flutter SDK"
                );
            case 4:
                return new AreaTecnologica(
                    "Backend",
                    "Java, Python, Node.js, SQL",
                    "1. Aprende un lenguaje de backend como Java, Python o Node.js\n2. Domina bases de datos SQL\n3. Explora frameworks como Spring Boot o Express.js\n4. Construye APIs y servicios backend",
                    "IntelliJ IDEA, PyCharm, Postman"
                );
            case 5:
                // Opción 5: salir del sistema
                System.out.println("Saliendo del sistema...");
                System.exit(0);
                return null;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
                return null;
        }
    }
}
