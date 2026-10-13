
# Projeto - ESGenergia (Cidades ESG Inteligentes)

**Desenvolvido por::**
- Cássio Mateus da Silva Linhares (RM565388)
- Pedro Aguiar de Freitas Valadão (RM562706)
- Felipe de Lima Simões (RM562740)
- Leandro Camilo Soares (RM565080)
- Felipe Castro Santos (RM566391)

## Como executar localmente com Docker
1. Certifique-se de ter o Docker e o Docker Compose instalados.
2. Na raiz do projeto, execute o comando: `docker-compose up --build -d`
3. A API estará rodando na porta 8080 e o MongoDB na porta 27017.
4. Para parar os serviços, utilize: `docker-compose down`

## Pipeline CI/CD
Utilizamos o **GitHub Actions** para automatizar a integração e entrega contínuas. O pipeline é composto por três etapas (jobs):
1. **Build e Testes**: Faz o checkout do código, configura o JDK 21 e executa o Maven (`mvn clean test package`) para validar o código.
2. **Deploy Staging**: Após os testes passarem, simula o deploy automático em um ambiente de homologação.
3. **Deploy Produção**: Por fim, simula a promoção do código para o ambiente de produção.

## Containerização
A aplicação foi empacotada usando um *Dockerfile* com *multi-stage build*. 
A primeira etapa compila o Java com Maven e a segunda etapa utiliza uma imagem Alpine mínima com o JRE 21 para executar o `.jar`.
A orquestração com o banco MongoDB é feita pelo `docker-compose.yml`, utilizando uma rede (`esg-network`) para comunicação interna e um volume (`mongodb_data`) para persistência das coleções.

## Prints do funcionamento
*Insira aqui as capturas de tela solicitadas (Build do GitHub Actions verdinho, Deploy Staging e Deploy Produção)*

## Tecnologias utilizadas
- Java Spring Boot
- MongoDB
- Docker & Docker Compose
- GitHub Actions (CI/CD)
- Maven