# 使用token的方式多端验证

angular中用法
```ts
    let url = `http://localhost:8080/login`;
    console.log(url);
    const form = {'username': 'admin', 'password': 'admin1'};
    this.http.post(url, JSON.stringify(form))
      .toPromise().then(response => {
        console.log(response);
        return response as BaseResponse;
      }).then(res => {
        url = `http://localhost:8080/hello`;
        return this.http.get(url, {headers: {
          'Authorization': `Bearer ${res.message}`
        }}).toPromise();
      }).then(res => {
        console.log('hello:', res);
      }).catch(err => {
        console.log(err);
      });
```