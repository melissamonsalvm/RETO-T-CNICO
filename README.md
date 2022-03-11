### RETO TÉCNICO T-Evolvers 

Este proyecto es la solución al reto técnico planteado por la empresa T-Evolvers, la cual consta de dos pruebas automatizadas, la primera consiste en una API con diversos endpoints y la segunda es una página demo de una tienda virtual.

#### Requisitos previos:

- Java y JDK (variables de entorno configuradas)
- Eclipse IDE o IntelliJ IDEA
- Gradle (variable de entorno configurada)

#### Clonar el proyecto:

Para clonar este repositorio se debe ejecutar el siguiente comando:

```bash
    git clone https://github.com/melissamonsalvm/RETO-T-CNICO.git
```

### PRUEBA DE AUTOMATIZACIÓN API

### restful-booker
Restful-booker es una API web de creación, lectura, actualización y eliminación que viene con características de autenticación y un montón de errores.
La API viene precargada con 10 registros y se restablece cada 10 minutos a ese estado por defecto.

#### Herramientas utilizadas:
La automatización restful-booker-karate fue desarrollada utilizando el IDE de IntelliJ IDEA y herramientas como:

- **Karate BDD** - Marco de pruebas
- **Gradle** - Gestor de dependencias
- **Cucumber** - Reportes
- **Gherkin** - Lenguaje DLS legible por el negocio (lenguaje específico de dominio legible por el negocio)
- **Java**
- **Lombok** - Anotaciones

**Patrones de desarrollo:**

- Para el desarrollo de la automatización se utilizaron los siguientes patrones de desarrollo:

**Variables:** camelCase
**Funciones:**camelCase
**Paquetes:**camelCase
**Clases:**PascalCase

**Versionado:**
- Se utilizó Git para el control de versiones

#### Contenido de la automatización:

**Crear una reserva:**
- Crear correctamente una nueva reserva en la API
- Crear una reserva con datos no válidos

**Obtener una reserva por ID:**
- Obtener la reserva por ID con éxito
- Obtener una reserva por ID con datos incorrectos

**Crear Token de autenticación:** crea un nuevo token de autenticación que se utilizará para acceder a la función actualizar

- Crear con éxito un nuevo token de autenticación
- Crear un token de autenticación con datos incorrectos

**Actualizar una reserva:**
- Actualizar correctamente una reserva por id
- Actualizar una reserva sin token de autenticación

### Ejecución del proyecto

Para ejecutar el proyecto se debe abrir el ejecutor de tareas de Gradle, posterior a esto de debe escribir:

**Ejecutar en paralelo todas las pruebas y generar el reporte de Cucumber:**

    gradle test --tests karate.booking.TestParallel

Para visualizar el reporte que se genera se debe ingresar a **restful-booker-karate\build\cucumber-html-reports\overview-features.html**

**Ejecutar la prueba de creación de reserva:**

    gradle test --tests karate.booking.runners.CreateBookingRunner

**Ejecutar la prueba de busqueda de reserva por ID:**

    gradle test --tests karate.booking.runners.GetBookingRunner

**Ejecutar la prueba de creación para token de autenticación:**

    gradle test --tests karate.booking.runners.CreateTokenRunner

**Ejecutar la prueba de actualización de reserva por ID:**

    gradle test --tests karate.booking.runners.UpdateBookingRunner

o simplemente, clic derecho **"Run" (Ctrl+Shift+F10)** en la prueba que se desea ejecutar..

### PRUEBA DE AUTOMATIZACIÓN WEB:

### demoblaze

Demoblaze es una página demo sobre una tienda virtual, la cual permite elegir productos por diferentes categorías (teléfonos, laptops y monitores) y añadirlos al carrito, para simular una compra, además también permite simular un registro e inicio de sesión.

#### Herramientas utilizadas:
Esta automatización fue desarrollada en Google Chrome con el fin de ejecutar los procesos para la funcionalidad de búsqueda y agregado al carrito de compras, utilizando el IDE de IntelliJ IDEA y otras herramientas como:

- **BDD** - Estrategia de desarrollo
- **ScreenPlay** - Patrón de diseño
- **Gradle** - Gestor de dependencias
- **Cucumber** - Framework para automatizar pruebas BDD
- **Gherkin** - Lenguaje DLS legible por el negocio (lenguaje específico de dominio legible por el negocio)
- **Java**
- **Selenium Web Driver** - Herramienta para automatizar acciones en navegadores web
- **Serenity BDD** - Biblioteca de código abierto para la generación de reportes
- **Lombok** - Anotaciones

**Patrones de desarrollo:**

- Para el desarrollo de la automatización se utilizaron los siguientes patrones de desarrollo:

**Variables:** camelCase
**Funciones:** camelCase
**Paquetes:** camelCase
**Clases:** PascalCase

**Versionado:**
- Se utilizó Git para el control de versiones

#### Contenido de la automatización:

**Carrito de compras:**
- **Buscar y añadir productos al carrito de compra:** Se añaden 2 productos de cada categoría de la tienda y se verifica el precio total de los productos.

### Ejecución del proyecto

Para ejecutar el proyecto se debe abrir la terminal, posterior a esto de debe escribir:

    gradle clean build

o

    gradle clean test --tests ShoppingCart

Para ejecutar la prueba y generar el reporte:

    gradle clean build aggregate

o

    gradle clean test --tests ShoppingCart aggregate

Para visualizar el reporte que se genera se debe ingresar a **demoblaze/target/site/serenity/index.html**

o simplemente, clic derecho **"Run" (Ctrl+Shift+F10)** en la prueba que se desea ejecutar.



