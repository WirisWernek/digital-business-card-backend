# Digital Business Card Backend
Backend do serviço de Cartão de Visitas Digital

# Como rodar?
- Clone o projeto
- Na pasta raiz execute o comando `mvn install -DskipTests -X` ou `mvn install` para uma versão mais compacta dos logs e sem testes

## Via Docker

### Como criar a sua network do docker local?
`docker network create your_network_name`

Ex: `docker network create minha_rede`

### Para conectar um container a network, caso já tenha ele criado
`docker network connect networkname containername`

Ex: `docker network connect local postgresserver`

### Criando o container do banco de dados já com a network
Substitua `{your_password_here}` e `{your_network}` por uma senha de sua escolha e o nome da network criada anteriormente 

`docker run --name postgresserver --network {your_network} -e POSTGRES_PASSWORD={your_password_here} -e POSTGRES_DB=dbcdb -p 5432:5432 -d postgres:latest`

### Você vai precisar definir a senha usada em seu container do postgres no application-production.yml
- Na pasta raiz execute o comando `docker build -t visit-card-backend` para fazer o build da imagem
	- Voce pode optar por definir uma tag númerica usando o comando `docker build -t visit-card-backend:{versao}`, substitua `{versao}` pelo numero desejado 
- Execute o comando a seguir para iniciar a aplicação  `docker container run -d --name visit-card-backend --network {your_network} visit-card-backend`, lembre de substituir o ` {your_network}` pela network criada anteriormente.
	- A aplicação irá iniciar em modo deamom se isso não lhe agradar pode remover o parâmetro -d
	- Antes da execução você precisa ajustar o nome do container do banco e a senha que você definiu no application-production.yml

## Swagger: [Clique Aqui](https://wiriswernek.github.io/digital-business-card-backend/)

<h2 align="center">Diagrama Entidade Relacionamento</h2>
<div align="center">
	<img width="800" src="./docs/images/dbcdb_diagram.png">
</div>

Swagger baseado na [documentação](https://swagger.io/docs/open-source-tools/swagger-ui/usage/installation/)
