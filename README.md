# Aplicación de Gestión de Residuos (PABLO BARBOSA, ADRIÁN PUYO, ASSIL ASRI Y DANIEL SOUSA)

# Link del Repositorio: https://github.com/pablobarbosaojeda/AplicacindeGestindeResiduos.git

Esta aplicación tiene como objetivo ayudar a los usuarios a gestionar la recolección de residuos, mostrando información sobre reciclaje, puntos de recogida y estadísticas relacionadas con los residuos reciclados y no reciclados. Está desarrollada con Android Studio utilizando Kotlin.

## Funcionalidades Principales

1. **Calendario de recolección de residuos**: Permite seleccionar fechas para marcar días de reciclaje y agregar recordatorios.
2. **Mapa con puntos de reciclaje**: Muestra un mapa de la localidad con puntos de reciclaje destacados.
3. **Estadísticas de reciclaje**: Muestra estadísticas básicas de residuos reciclados y no reciclados.

## Estructura del Proyecto

### 1. `MainActivity`

La `MainActivity` es el punto de entrada de la aplicación. Al iniciar la aplicación, los usuarios son recibidos con una pantalla que muestra tarjetas (`CardViews`) para acceder a las funcionalidades principales:

- **CardView para el calendario**: Contiene un botón para abrir la actividad del calendario de recolección de residuos.
- **CardView para el mapa**: Contiene un botón que redirige a una actividad donde se muestra un mapa con los puntos de reciclaje.
- **CardView para las estadísticas**: Contiene un botón para acceder a las estadísticas de residuos reciclados y no reciclados.

### 2. `CalendarActivity`

La `CalendarActivity` permite a los usuarios visualizar un calendario y realizar las siguientes acciones:

- **Seleccionar una fecha**: A través de un `CalendarView`, los usuarios pueden navegar por el calendario y seleccionar una fecha específica. La fecha seleccionada se guarda en una variable local y se muestra mediante un `Toast` para confirmación visual.
  
- **Marcar reciclaje**: Un botón permite a los usuarios marcar una fecha en el calendario como día de reciclaje. Aunque la aplicación actualmente solo muestra un mensaje confirmando esta acción, es posible expandir esta funcionalidad para almacenar la información en una base de datos o usar preferencias compartidas.
  
- **Agregar recordatorio**: Similar al botón de reciclaje, esta opción permite agregar un recordatorio para la fecha seleccionada. Aún no se ha implementado la lógica completa de recordatorios, pero se puede integrar más adelante, por ejemplo, utilizando el sistema de notificaciones de Android.

### 3. `MapActivity`

La `MapActivity` muestra una imagen de un mapa con los puntos de reciclaje en un `ImageView`. Esta actividad puede servir como referencia visual para que los usuarios localicen los puntos de reciclaje más cercanos.

Características:
- **Imagen del mapa**: La imagen es estática y está cargada desde los recursos de la aplicación (`@drawable/puntolimpiovillanueva`), pero podría expandirse para incluir mapas interactivos con marcadores dinámicos si se integran servicios de mapas como Google Maps.

### 4. `StatisticsActivity`

La `StatisticsActivity` muestra datos de residuos reciclados y no reciclados a través de un diseño simple de `TextViews`. La información proporcionada es un ejemplo básico de cómo los usuarios pueden ver su impacto ambiental mediante los residuos gestionados.

Características:
- **Datos de residuos reciclados**: Se muestra una cantidad en kilogramos de residuos reciclados.
- **Datos de residuos no reciclados**: Similar al reciclaje, se muestra la cantidad de residuos que no fueron reciclados.
- **Posibilidad de expansión**: En futuras implementaciones, esta pantalla podría conectarse a una base de datos para mostrar datos más dinámicos, tal vez incluso gráficos para una representación visual más detallada.

### 5. `AndroidManifest.xml`

Este archivo define las actividades de la aplicación y las relaciones entre ellas:

- **MainActivity**: Es la actividad principal que se lanza cuando la aplicación es iniciada.
- **CalendarActivity**: Actividad para el calendario.
- **MapActivity**: Actividad que muestra el mapa de reciclaje.
- **StatisticsActivity**: Actividad para mostrar las estadísticas de reciclaje.

## Flujo de Navegación

1. **Pantalla principal (MainActivity)**: Desde aquí, los usuarios pueden navegar hacia el calendario, el mapa o las estadísticas.
2. **Calendario (CalendarActivity)**: Permite seleccionar una fecha y marcar reciclaje o agregar recordatorios.
3. **Mapa (MapActivity)**: Muestra un mapa con los puntos de reciclaje.
4. **Estadísticas (StatisticsActivity)**: Presenta las estadísticas de residuos reciclados y no reciclados.

## Requisitos

- Android Studio (versión mínima recomendada: Arctic Fox)
- Dispositivo o emulador con Android 5.0 (Lollipop) o superior

