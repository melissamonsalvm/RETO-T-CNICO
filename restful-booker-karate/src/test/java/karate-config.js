function fn(){

    karate.configure('connectTimeout', 10000);
    karate.configure('readTimeout', 10000);
    karate.configure('ssl', true);

    return{
    api:
        {
        baseUrl: 'https://restful-booker.herokuapp.com'
        },
    credentials:
        {
        username: 'admin',
        password: 'password123'
        }
    }
}