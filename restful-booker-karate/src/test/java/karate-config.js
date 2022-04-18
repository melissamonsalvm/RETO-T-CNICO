function fn() {

    karate.configure('connectTimeout', 15000);
    karate.configure('readTimeout', 15000);
    karate.configure('ssl', true);

    return {
        api:{
            baseUrl: 'https://restful-booker.herokuapp.com'
        },
        credentials:{
            username: 'admin',
            password: 'password123'
        }
    }
}