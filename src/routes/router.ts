import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router';

const routes: Array<RouteRecordRaw> = [
    {
        path: '/',
        name: 'Home',
        component: ()=>import(/*webpackChunkName: "home"*/"../components/Home.vue"),
    },
    {
        path: '/login',
        name: 'Login',
        component: ()=>import(/*webpackChunkName: "login"*/"../components/Login.vue"),
    },
    {
        path: '/login',
        name: 'Login',
        component: ()=>import(/*webpackChunkName: "login"*/"../components/Login.vue"),
    },

    {
        path: '/user',
        name: 'User',
        component: ()=>import(/*webpackChunkName: "user"*/"../components/UserSideBarHome.vue"),
    },

];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
