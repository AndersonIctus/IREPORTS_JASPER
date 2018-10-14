# Projeto REPORTS
Um projeto exemplo para criação de relatórios utilizando o JASPER e SPRING BOOT

## Dependências
IReports iReport-5.6.0 [https://community.jaspersoft.com/project/ireport-designer/releases]
IDE STS [https://spring.io/tools3/sts/all] - baseado no Eclipse

Postgres SQL
 * Criar o banco 'financas'.
 * Pode ser um banco de dados diferente, pois os dados necessarios serão carregados via script de inicialização.
 * Guarde o usuario e senha para ser configurado no properties do srpingboot.

### Projeto feito em maven para WEB
* Importar como maven project (https://start.spring.io/)
* Criar o banco de dados e configurar o usuario e senha 
    * Ver no resources (/rc/main/recsources/) o que foi configurado para o banco de dados
* O Projeto já vem com um SCRIPT de inicialização dos dados da tabela
    * Tabelas: 
* E já está pronto para ser utilizado !!
