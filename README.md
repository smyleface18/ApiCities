# API de Gestión de Ciudades

Esta API proporciona endpoints para gestionar información sobre ciudades, como su nombre, distrito y población. Es útil para aplicaciones que necesitan trabajar con datos geográficos, como la lista de ciudades de un país.

## Uso
- [Endpoints]
  - [Obtener todas las ciudades]
  - [Agregar una nueva ciudad]
  - [Eliminar una nueva ciudad]
  - [Otros Endpoints]
- [Ejemplo de Respuesta]  : {
        "name": "Bogota",
        "district": "Capital",
        "population": 7900000,
        "img": "06bdd-e47546b20c3a.png",
        "id": 2
    }


## Características

- Obtener una lista de ciudades con su información (nombre, distrito, población).
- Agregar una nueva ciudad.
- Manejo de errores básico para respuestas fallidas.
- Compatible con JSON.

## Instalación

1. Clona el repositorio en tu máquina local:

   ```bash
   git clone https://github.com/smyleface18/ApiCities.git
