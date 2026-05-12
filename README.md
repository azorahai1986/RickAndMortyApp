# Rick And Morty App

Aplicación Android desarrollada en Kotlin utilizando Jetpack Compose y Clean Architecture.

La app consume la API pública de Rick and Morty para mostrar personajes, detalles e información relacionada utilizando una arquitectura moderna, escalable y mantenible.

---

# Features

- Lista de personajes
- Pantalla de detalle
- Consumo de API REST
- Navegación entre pantallas
- Manejo de estados Loading / Success / Error
- UI reactiva con StateFlow
- Manejo de errores
- Inyección de dependencias
- Arquitectura escalable
- Soporte para imágenes remotas

---

# Tecnologías utilizadas

- Kotlin
- Jetpack Compose
- Clean Architecture
- MVVM
- Hilt
- Coroutines
- StateFlow
- Retrofit
- Coil
- Navigation Compose

---

# Arquitectura

La aplicación está organizada utilizando Clean Architecture para separar responsabilidades y mejorar la escalabilidad del proyecto.

## Capas

### Presentation
Contiene:
- Screens
- ViewModels
- State management
- Componentes UI

### Domain
Contiene:
- UseCases
- Modelos de dominio
- Interfaces de repositorios

### Data
Contiene:
- Repositories
- DTOs
- Remote data sources
- Implementaciones Retrofit

---

# Flujo de arquitectura

```txt
UI -> ViewModel -> UseCase -> Repository -> API
```

---

# Manejo de estado

La UI utiliza `StateFlow` para emitir estados reactivos y mantener sincronizada la interfaz con los cambios de datos.

Ejemplo de estados:

- Loading
- Success
- Error

---

# Screenshots

## Characters Screen

Agregar screenshot aquí

## Detail Screen

Agregar screenshot aquí

---

# Video Demo

Agregar video demo aquí

---

# APK

Agregar APK release aquí

---

# Cómo ejecutar el proyecto

## Clonar repositorio

```bash
git clone https://github.com/azorahai1986/RickAndMortyApp.git
```

## Abrir en Android Studio

Abrir el proyecto y sincronizar Gradle.

## Ejecutar

Seleccionar un dispositivo o emulador y ejecutar la app.

---

# API utilizada

Rick and Morty API

https://rickandmortyapi.com/

---

# Qué aprendí

Durante el desarrollo de este proyecto trabajé en:

- Arquitectura limpia
- Manejo de estado reactivo
- Separación de responsabilidades
- Inyección de dependencias con Hilt
- Consumo de APIs REST
- Navegación en Compose
- Optimización de UI
- Buenas prácticas en Android moderno

---

# Posibles mejoras futuras

- Paginación con Paging 3
- Cache local con Room
- Búsqueda de personajes
- Shimmer loading
- Tests unitarios
- Dark mode avanzado
- Offline support

---

# Autor

Hernán Torres

GitHub:
https://github.com/azorahai1986
