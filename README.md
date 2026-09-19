# Backend Music

Backend básico em Java com Spring Boot para servir uma aplicação mobile com CRUD de songs.

## Estrutura

- `controller` para expor a API REST
- `service` para regras de negócio
- `repository` para acesso ao banco
- `entity` para o modelo de domínio

## Tecnologias

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker Compose

## Como rodar o banco

```bash
docker compose up -d
```

## Como rodar a API

```bash
mvn spring-boot:run
```

## Como rodar tudo com Docker

```bash
docker compose up --build
```

## Endpoints

- `GET /api/songs`
- `GET /api/songs/{id}`
- `POST /api/songs`
- `PUT /api/songs/{id}`
- `DELETE /api/songs/{id}`

## Exemplo de payload

```json
{
  "title": "Song name",
  "artist": "Artist name",
  "album": "Album name",
  "releaseYear": 2026
}
```
