import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router';

const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        name: 'Home',
        component: ()=>import(/*webpackChunkName: "home"*/"../view/Home.vue"),
    },
    {
        path: '/login',
        name: 'Login',
        component: ()=>import(/*webpackChunkName: "login"*/"../components/Login.vue"),
    },
    {
        path: '/user/:userName',
        name: 'User',
        component: ()=>import(/*webpackChunkName: "user"*/"../view/HomeUser.vue"),
    },

];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
