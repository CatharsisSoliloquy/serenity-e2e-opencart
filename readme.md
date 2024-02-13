
# Ejercicio de Automatización E2E con Serenity BDD

Este proyecto contiene una prueba funcional automatizada (E2E) para el flujo de compra en la página de [OpenCart](http://opencart.abstracta.us/).

## Requisitos

- IntelliJ IDEA 2023.3.3
- JDK 17: Es **muy importante** que tengas Java en tus variables de entorno. Si no sabes cómo hacerlo, puedes seguir esta [guía](https://www.youtube.com/watch?v=BG2OSaxWX4E).
- Maven 3.9.1 : Es **muy importante** que tengas Maven en tus variables de entorno. Si no sabes cómo hacerlo, puedes seguir esta [guía](https://www.youtube.com/watch?v=rl5-yyrmp-0).
- Serenity BDD se instalará automáticamente al ejecutar el proyecto junto a otras dependencias necesarias. *Para más información sobre las dependencias del proyecto, puedes consultar el archivo [pom.xml](https://github.com/CatharsisSoliloquy/serenity-e2e-opencart/blob/main/pom.xml).*
- Navegador web de preferencia:
    - Google Chrome
    - Microsoft Edge
    - Mozilla Firefox
  > **Nota:** Más adelante en este documento, se explicará cómo cambiar la ejecución de la prueba en estos navegadores.

Si eres un desarrollador y quieres modificar este proyecto, también necesitarás los siguientes plugins  en tu IDE:

- Cucumber +
- Cucumber for Java
- Gherkin

> **Importante:** Este proyecto se ha desarrollado y probado en un entorno Windows 11.




## Instalación

1. Clona este repositorio en tu máquina local.

## Ejecución de las pruebas y Visualización de reporte

1. Navega hasta el directorio del proyecto en tu terminal.
2. Ejecuta las pruebas con `mvn clean verify`.


> **Nota:** Si las pruebas no se ejecutan correctamente, es posible que el WebDriver que se descargo automaticamente no sea compatible con tu navegador. Para solucionar esto, puedes cambiar de navegador en el archivo `serenity.properties`. Aquí tienes un ejemplo de cómo configurar Firefox como tu navegador, además de una lista de navegadores recomendados con el valor a reemplazar en **webdriver.driver** :

```properties
// Puedes cambiar de navegador con:
// Microsoft Edge = edge
// Google Chrome = chrome
// Firefox = firefox

webdriver.driver=firefox
webdriver.autodownload=true
serenity.browser.maximized=true 
```
3. Una vez que las pruebas se hayan ejecutado, Serenity generará un informe en HTML. Puedes encontrar el enlace al informe de Serenity en la salida de la consola después de ejecutar las pruebas. Busca la línea que comienza con `[INFO] SERENITY REPORTS`. Al hacer clic en el enlace, serás redirigido a tu navegador predeterminado para visualizar el informe. Por ejemplo:
>
> ```plaintext
> [INFO] SERENITY REPORTS
> [INFO]   - Full Report: file:///C:/Users/josue/IdeaProjects/serenity-e2e-opencart/target/site/serenity/index.html
>


También puedes encontrar este informe dentro del proyecto. Se encuentra en el directorio dentro `serenity-e2e-opencart/target/site/serenity/index.html`.


## Hallazgos y conclusiones

Por favor, consulta el archivo `conclusiones.txt` para ver los hallazgos y conclusiones de este ejercicio.
