# IMB MQ Java 

## Imagem docker
```
docker pull ibmcom/mq
```

## Inicializando container docker
```
docker run \
    --env LICENSE=accept \
    --env MQ_QMGR_NAME=QMGR \
    --publish 1414:1414 \
    --publish 9443:9443 \
    --detach \
    ibmcom/mq
```

## Acessando o console do IMB MQ
```
https://localhost:9443/ibmmq/console 
```

## Credenciais default
```
Username: admin
Password: passw0rd
```

## Execução
### Configuração

Parametrize os dados de conexão no arquivo `application.properties`
```
ibm.mq.queueManager=QMGR
ibm.mq.channel=DEV.APP.SVRCONN
ibm.mq.connName=localhost
ibm.mq.user=app
ibm.mq.password=passw0rd
```

Obs.: essas são as configurações padrões. Deve usar o `channel` e o `user` do exemplo.

### Publicando uma mensagem
Acesse o endpoint `/api/ibmmq/{message}` do tipo `POST` para enviar uma mensagem diretamente para a fila `DEV.QUEUE.1` do IMB MQ. 

Obs.: Utilizei o método `POST` apenas para facilitar a publicação de uma mensagem via browser, sem precisar de um client HTTP como Postman ou Insomnia, por exemplo.

Para mais informações, acesse a documentação do IMB MQ [aqui](https://www.ibm.com/docs/en/ibm-mq/9.2?topic=programs-example-c-code-fragment-use-net).