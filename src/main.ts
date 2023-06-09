import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import router from "@/routes/router";
import client_secret from "../secret/client_secret.json"
import store from "@/store";
// @ts-ignore
import v3GoogleLogin from "vue3-google-login";

const app = createApp(App)

app.use(v3GoogleLogin, {
    clientId: client_secret.web.client_id
})
app.use(router)
app.use(store)


app.mount('#app')