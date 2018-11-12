*----------------Realizado por---------------------*
|						   |
|	Sidnei Aparecido Lechado Junior 1598597    |
|	João Fernando Garcia de Souza 1892886      |
|  Alunos do 5º período de Engenharia de Software  |
|     Universidade Tecnológica Federal do Paraná   |
|						   |
*--------------------------------------------------*

-Banco de dados utilizado mysql Workbench;
-Sql code anexado na pasta em: "sql_code.txt";
-As configurações da conexão com o banco, estão no pacote "connection" e dentro da classe "ConnectionFactory.java";
-Somente alterar as configurações abaixo:

    private static final String DRIVER = "com.mysql.jdbc.Driver";	      //driver do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/projeto";  //url de conexão com o banco
    private static final String USER = "root";                                //nome de usuário do banco 
    private static final String PASS = "";				      //password do banco de dados

-O drive do banco pode ser encontrado no site do banco de dados. Na IDE Netbeans, dependendo do processo de instalação
escolhido, vem incluso o drive de alguns bancos mais conhecidos, sendo necessário apenas importar para a pasta do projeto
-Link para download do driver caso não possuir: "https://dev.mysql.com/downloads/connector/j/8.0.html"
 



			