# 네트워킹

## 네트워크 데이터 입력 및 출력

네트워크 대상(객체) 사이에 입/출력(InputStream, OutputStream)를 이용해서 데이터를 입력하고 출력한다

<br />

## Socket

네트워크상에서 데이터를 주고받기 위한 장치

- 클라이언트   
ServerSocket에서 socket 반환받음

- 서버   
ServerSocket 생성

<br />

## 예제

### MainClass 실행 

![img.png](img.png)

`localhost:9000` 접속   
![img_1.png](img_1.png)

---

### MainServer, MainClient 실행

MainServer 실행   
![img_2.png](img_2.png)

MainClient 실행   
![img_3.png](img_3.png)   
`MainServer`
![img_4.png](img_4.png)

---

### ServerClass, ClientClass 실행

ServerClass 실행   
![img_5.png](img_5.png)

ClientClass 실행   
![img_6.png](img_6.png)

#### 데이터 입력   
`ServerClass`   
![img_7.png](img_7.png) 

`ClientClass`   
![img_9.png](img_9.png)   

#### `STOP` 입력   
`ServerClass`   
![img_8.png](img_8.png)

`ClientClass`   
![img_10.png](img_10.png)
