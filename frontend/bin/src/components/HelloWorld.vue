<template>
  <div class="hello">
    
    <button class=”Search__button” @click="callTestApi()">CALL Spring Boot REST backend service</button>
      <h3>Name</h3>
      <br/><input type="text" id="nameInput" v-model="defect_name">
      <h3>ID</h3>
      <br/><input type="text" id="idInput" v-model="defect_id">
      <h3>{{ defects }}</h3>
      <button v-on:click="saveOrUpdatePostDefectApi()"/>
  </div>
</template>

<script>
import api from "./backend-api";

export default {
  name: "HelloWorld",

  data() {
    return {
      defects: [],
      defect_name: "",
      defect_id: "",
      errors: []
    };
  },
  methods: {
    callTestApi() {
      api
        .hello()
        .then(response => {
          this.defects = response.data;
          console.log(response.data);
        })
        .catch(error => {
          this.errors.push(error);
        });
    },
    saveOrUpdatePostDefectApi() {
      console.log(this.defect_id);
      api.saveOrUpdateNewDefect(this.defect_id, this.defect_name);
    }
  }
};
</script>

<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
