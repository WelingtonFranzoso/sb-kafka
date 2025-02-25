# Spring Boot com Kafka

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/sb-kafka/blob/main/LICENSE) 

# Sobre o projeto

Este projeto envolve dois microserviços desenvolvidos em Java com Spring Boot e Apache Kafka. O sistema é composto por um produtor (Producer) que envia mensagens contendo informações de uma classe ChatMessage para um tópico no Apache Kafka. Essas mensagens são então consumidas por dois consumidores (Consumers) que pertencem a grupos diferentes (com GroupId distintos). O consumidor consumer1 faz uso de múltiplas threads para consumir as mensagens de diferentes partições dentro do mesmo tópico, garantindo maior paralelismo e eficiência no processamento.

# Funcionalidades
- Envio de mensagens para o Kafka através de um Producer.
- Processamento das mensagens por dois Consumers.
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
