import axios from 'axios'

const AXIOS = axios.create({
    baseURL: `//localhost:8080/api`,
    timeout: 1000,
    headers: {
        'Access-Control-Allow-Origin': 'http://localhost:8080'
    }
});


export default {
    hello() {
        return AXIOS.get(`/test`);
    },
    saveOrUpdateNewDefect(id, name) {
        return AXIOS.post("/newdefect", {
            id: id,
            name: name,
        });
    }

}