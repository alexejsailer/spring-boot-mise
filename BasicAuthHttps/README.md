# spring-boot-mise
Basic Authentication Example / Https

Setup SSL Key
Replace com.dualexec.xxx with your preferred name 
```
openssl genrsa -out com.dualexec.key 2048 
openssl req -new -key com.dualexec.key > com.dualexec.csr -sha256
openssl x509 -in com.dualexec.csr -out com.dualexec.crt -req -signkey com.dualexec.key -days 365
openssl pkcs12 -export -in com.dualexec.crt -inkey com.dualexec.key -out keystore.p12 -name ssl
keytool -importkeystore -deststorepass changeit -destkeypass changeit -destkeystore /home/ubuntu/user/keystore.jks -srckeystore keystore.p12 -srcstoretype PKCS12 -srcstorepass changeit -alias ssl
```

