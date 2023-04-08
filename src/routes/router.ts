import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router';
import App from '@/App.vue';
import Login from '@/components/Login.vue'

const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        name: 'App',
        component: App,
    },
    {
        path: '/login',
        name: 'Login',
        component: Login,
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
