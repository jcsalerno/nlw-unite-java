# Pass-in

O Pass-in é um aplicativo desenvolvido na semana de imersão de Java juntamente com a Rocketseat.

## Descrição do Projeto

O Pass-in é uma aplicação Java desenvolvida para gerenciar eventos e participantes da Rocketseat. Ele permite criar eventos, registrar participantes, fazer check-in dos participantes nos eventos e gerar crachás de participantes.

## Requisitos de Sistema

- Java 17
- Maven
- Spring Boot

## Instruções de Instalação

1. Clone o repositório do Pass-in.
2. Certifique-se de ter o Java e o Maven instalados em sua máquina.
3. Compile o projeto usando o Maven: `mvn clean package`.
4. Execute o arquivo JAR gerado: `java -jar pass-in.jar`.

## Como Executar o Programa

Para executar o Pass-in, siga as etapas de instalação mencionadas acima. Após a execução, o programa estará disponível em `http://localhost:8080`.
## ### Regras de negócio

- O participante só pode se inscrever em um evento uma única vez;
- O participante só pode se inscrever em eventos com vagas disponíveis;
- O participante só pode realizar check-in em um evento uma única vez;
- 
## Exemplos de Uso

### Criar Evento

Você pode criar um evento enviando uma solicitação POST para `/events`. Use o seguinte JSON como exemplo:

```json
{
  "title": "Evento de Lançamento",
  "details": "Um evento emocionante para lançar nosso novo produto.",
  "maximumAttendees": 100
}
 ``` 

### EventController

- **Obter Evento por ID**: Para obter detalhes de um evento específico, envie uma solicitação GET para `/events/{id}`.
- **Criar Evento**: Para criar um novo evento, envie uma solicitação POST para `/events`.
- **Registrar Participante em um Evento**: Para registrar um participante em um evento, envie uma solicitação POST para `/events/{eventId}/attendees`, substituindo `{eventId}` pelo ID do evento.
- **Obter Lista de Participantes de um Evento**: Para obter a lista de participantes de um evento, envie uma solicitação GET para `/events/attendees/{id}`, substituindo `{id}` pelo ID do evento.

### AttendeeController

- **Obter Crachá do Participante**: Para obter o crachá de um participante, envie uma solicitação GET para `/attendees/{attendeeId}/badge`, substituindo `{attendeeId}` pelo ID do participante.
- **Realizar Check-in do Participante**: Para fazer check-in de um participante em um evento, envie uma solicitação POST para `/attendees/{attendeeId}/check-in`, substituindo `{attendeeId}` pelo ID do participante.
