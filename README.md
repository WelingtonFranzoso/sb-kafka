# Spring Boot com Kafka

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/sb-kafka/blob/main/LICENSE) 

# Sobre o projeto

Este é um microserviço Java utilizando Spring Boot e Apache Kafka. O sistema consiste em um Producer que envia mensagens com informações de uma classe ChatMessage para dois Consumers em GroupId diferentes, consumer1 também faz uso de threads para cosumir partições difentes de um mesmo tópico.

# Funcionalidades
- Envio de mensagens para o Kafka através de um Producer.
- Processamento das mensagens por um Consumer.
- Configuração dinâmica de tópicos no Kafka.
- API REST para envio de eventos de usuários.
- Uso de threads para consumir patições diferentes de um tópico

# Tecnologias utilizadas

- Java 17+
- Spring Boot
- Maven
- Spring Kafka
- Apache Kafka
- Docker

# Como executar o projeto
## Back end
### Pré-requisitos: 
- Java 17 ou superior
- Maven (para construção do projeto)

```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/sb-kafka.git

# entrar na pasta do projeto back end
cd sb-kafka

# Subindo um ambiente Kafka via Docker
docker-compose up -d

# entrar na pasta do projeto Producer
cd sb-kafka-producer

# executar o projeto
./mvnw spring-boot:run

# entrar na pasta do projeto Consumer
cd sb-kafka-consumer

# executar o projeto
./mvnw spring-boot:run

# entrar na pasta do projeto Consumer2
cd sb-kafka-consumer2

# executar o projeto
./mvnw spring-boot:run
```

# Endpoints Disponíveis

| Método | Endpoint      | Descrição             |
|:------:|:-------------:|:---------------------:|
| Post    | /chat      | Envia uma mensagem com as informações da classe ChatMessageDTO para o kafka |


# Contribuição

1. Fork este repositório

2. Crie uma branch (feature-nova)

3. Commit suas mudanças (git commit -m 'Add nova feature')

4. Push para sua branch (git push origin feature-nova)

5. Crie um Pull Request

# Licença

- Este projeto está sob a licença MIT. Sinta-se livre para usá-lo e modificá-lo.
