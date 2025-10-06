Saga API – Mini Proyecto de Integración Continua

Autor: Alfredo Enrique Revollo Castañeda
Universidad: Manuela Beltrán
Carrera: Ingeniería de Software
Materia: Ingeniería Web 1

Fecha: Octubre de 2025

📘 Descripción

Este proyecto implementa una API RESTful desarrollada con Spring Boot, que simula la gestión de requerimientos o solicitudes de acceso corporativo.
Incluye un entorno completo de Integración Continua (CI/CD) basado en GitHub Actions, con pruebas automatizadas, análisis de calidad de código, y verificación de vulnerabilidades.

Arquitectura y Stack:

Componente	Descripción
Lenguaje	Java 17

Framework	Spring Boot 3.5.6

Patrón	MVC (Modelo–Vista–Controlador)

Base de datos	En memoria (ArrayList)

Documentación API	Swagger / OpenAPI

Control de versiones	Git y GitHub

CI/CD	GitHub Actions + SonarCloud + OWASP

Pruebas	JUnit + JaCoCo

🧩 Endpoints principales

Método	Endpoint	Descripción
POST	/api/requerimientos	Agrega un nuevo requerimiento
GET	/api/requerimientos	Lista todos los requerimientos
GET	/api/requerimientos/{id}	Obtiene un requerimiento por ID
PUT	/api/requerimientos/{id}/estado	Actualiza el estado de un requerimiento

Swagger UI:
http://localhost:8080/swagger-ui/index.html

Integración Continua (CI)

El proyecto incluye un workflow (.github/workflows/java-ci.yml) que ejecuta automáticamente:

Compilación del proyecto (mvn clean verify)

Pruebas unitarias y de integración (JUnit)

Cálculo de cobertura (JaCoCo)

Análisis de calidad (SonarCloud)

Carga de reportes en GitHub Actions

Los resultados pueden verse en la pestaña Actions del repositorio.

Seguridad y Análisis de Vulnerabilidades

Workflow adicional (.github/workflows/security-scan.yml) con:

OWASP Dependency Check → identifica dependencias vulnerables

CodeQL → analiza el código fuente para detectar patrones inseguros

SonarCloud → refuerza la calidad y seguridad del código

🔁 Se ejecuta con cada push y automáticamente cada lunes a las 3 AM.

📈 Resultados y Calidad del Código

Cobertura JaCoCo: (ver reporte en target/site/jacoco/)

Calidad del código: disponible en SonarCloud

Reportes: descargables desde Actions → Artifacts

Cómo ejecutar el proyecto
# Clonar el repositorio
git clone https://github.com/<tu-usuario>/saga-api.git
cd saga-api

# Ejecutar aplicación Spring Boot
mvn spring-boot:run


📍 Por defecto corre en http://localhost:8080.

🧾 Licencia

Proyecto académico desarrollado con fines educativos bajo la Universidad Manuela Beltrán.
No se autoriza su uso comercial sin previa autorización del autor.
