# Template Rest Assured

### 📌 Pré-requisitos instalados na máquina:

* Java **(preferencialmente ≥ versão 11)**
* Gradle **(preferencialmente ≥ versão 7.5.1)**

### 🔧 Tecnologias utilizadas

* [Java](https://www.java.com/pt-BR/)
* [Rest-Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)
* [TestNG](https://www.devmedia.com.br/artigo-java-magazine-62-testes-avancados-com-o-testng/10825)
* [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)
* [Log4j](https://logging.apache.org/log4j/2.x/)

## ⚙️ Configuração ambientes:

* Esse modelo conta com a _configuração_ de rodar em **ambientes distintos** (diversos ambientes diferentes)
* Configuramos _nossa_ **env** com o nome de **ambiente-1** e **ambiente-2**

<details><summary>[PASSO 1]</summary>

![passo1.png](img-readme%2Fpasso1.png)

</details>

<details><summary>[PASSO 2]</summary>

![passo2.jpg](img-readme%2Fpasso2.jpg)

  </details>
  
  <details><summary>[PASSO 3]</summary>
  
  ![passo3.jpg](img-readme%2Fpasso3.jpg)
  
  </details>

### 🏎️ Executando via IDE:

 * Para executar o teste local via **IDE** basta dar o play direto **(botão verde)** - irá pegar o **ambiente-1** _default_
   deseje alterar o ambiente de execução basta ir em: `Run > Edit Configurations > Edit configuration templates` e adicionar a configuração de sua **preferência**.

### ✈️ Executando via terminal:
 
 |             COMANDO                    | EXECUÇÃO                                             |
 |:---------------------------------------|:-----------------------------------------------------|
 | `gradle clean build test`                | **EXECUTA NO AMBIENTE-1** **~~(DEFAULT)~~**                  |
 | `gradle clean build test env=ambiente-1` | **EXECUTA NO AMBIENTE-1**                                |
 | `gradle clean build test env=ambiente-2` | **EXECUTA NO AMBIENTE-2**                                |
 
Cenários de testes:

  <details><summary>[🌟 TESTES 🌟]</summary>

![testes.png](img-readme%2Ftestes.png)

  </details>

