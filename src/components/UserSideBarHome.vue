<script >
    import store from '@/store.ts'

    export default {
        computed:{
            userName(){
                return store.state.userName;
            },
            profilePicUrl(){
                return store.state.profilePicUrl;
            }
        }

    }
</script>
<template>
    <div class="sidebar">
        <ul>
            <li><a href="#">
                <svg xmlns="http://www.w3.org/2000/svg"
                     width="48" height="48" viewBox="0 0 24 24"
                     style="fill: rgba(225, 225, 225, 1)">
                    <path d="M21 2H3a1 1 0 0 0-1 1v18a1 1 0 0 0 1 1h18a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1zm-1 6h-4v4h4v4h-4v4h-4v-4H8v4H4v-4h4v-4H4V8h4V4h4v4h4V4h4v4z">
                    </path>
                    <path d="M8 8h4v4H8zm4 4h4v4h-4z"></path>
                </svg>
                Play</a>
            </li>
            <li><a href="#">
                <svg xmlns="http://www.w3.org/2000/svg"
                     width="48" height="48" viewBox="0 0 24 24"
                     style="fill: rgba(225, 225, 225, 1)">
                    <path d="M2 3h2v18H2zm18 0h2v18h-2zM5 13h2v1h2v-1h2v1h2v-1h4v1h2v-4h-2v1h-4v-1h-2v1H9v-1H7v1H5zm0-9v4h2V7h8v1h2V7h2V5h-2V4h-2v1H7V4zm0 13v3h2v-1h2v1h2v-1h8v-2h-8v-1H9v1H7v-1H5z">

                    </path></svg>
                Learn</a></li>
            <li><a href="#">
                <svg xmlns="http://www.w3.org/2000/svg"
                     width="48" height="48" viewBox="0 0 24 24"
                     style="fill: rgba(225, 225, 225, 1)">
                    <path d="M21 4h-3V3a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1v1H3a1 1 0 0 0-1 1v3c0 4.31 1.799 6.91 4.819 7.012A6.001 6.001 0 0 0 11 17.91V20H9v2h6v-2h-2v-2.09a6.01 6.01 0 0 0 4.181-2.898C20.201 14.91 22 12.31 22 8V5a1 1 0 0 0-1-1zM4 8V6h2v6.83C4.216 12.078 4 9.299 4 8zm8 8c-2.206 0-4-1.794-4-4V4h8v8c0 2.206-1.794 4-4 4zm6-3.17V6h2v2c0 1.299-.216 4.078-2 4.83z">
                    </path>
                </svg>
                Rank</a></li>
            <li><a href="#">
                <svg xmlns="http://www.w3.org/2000/svg"
                     width="48" height="48" viewBox="0 0 24 24"
                     style="fill: rgba(225, 225, 225, 1)">
                    <path d="M3 13h1v7c0 1.103.897 2 2 2h12c1.103 0 2-.897 2-2v-7h1a1 1 0 0 0 .707-1.707l-9-9a.999.999 0 0 0-1.414 0l-9 9A1 1 0 0 0 3 13zm7 7v-5h4v5h-4zm2-15.586 6 6V15l.001 5H16v-5c0-1.103-.897-2-2-2h-4c-1.103 0-2 .897-2 2v5H6v-9.586l6-6z">
                    </path>
                </svg>
                Home</a></li>
        </ul>
        <ul class="user_profile">
                <li><a href="#">
                    <img :src="profilePicUrl" alt="Profile Picture" class="prof__pic">
                  {{ userName }}
                    </a></li>
            <li><a href="#">

                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24"
                     viewBox="0 0 24 24" style="fill: rgb(255,0,0)">
                    <path d="m2 12 5 4v-3h9v-2H7V8z"></path>
                    <path d="M13.001 2.999a8.938 8.938 0 0 0-6.364 2.637L8.051 7.05c1.322-1.322 3.08-2.051 4.95-2.051s3.628.729 4.95 2.051 2.051 3.08 2.051 4.95-.729 3.628-2.051 4.95-3.08 2.051-4.95 2.051-3.628-.729-4.95-2.051l-1.414 1.414c1.699 1.7 3.959 2.637 6.364 2.637s4.665-.937 6.364-2.637c1.7-1.699 2.637-3.959 2.637-6.364s-.937-4.665-2.637-6.364a8.938 8.938 0 0 0-6.364-2.637z">

                    </path>
                </svg>Logout</a></li>
        </ul>
    </div>
</template>

<style scoped>
a{
    font-size: 1.75rem;
    display: flex;
    flex-direction: column;
    justify-items: center;
    text-align: center;
}
ul{
    display: flex;
    align-items: center;
    justify-content: center;
    justify-items: center;
}
.user_profile{
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-items: center;
    justify-content: center;
    text-align: center;
}

.sidebar {
    position: fixed;
    top: 0;
    left: 0;
    bottom: 0;
    width: 140px;
    background-color: #2f2f2f;
    color: #fff;
    padding: 10px 10px 10px 10px;
}
.sidebar ul {
    display: flex;
    flex-direction: column;
    align-items: center;
    text-align: center;
    padding: 10px;
}

.sidebar li {
    padding: 12px;
}

.sidebar a {
    color: #fff;
    text-decoration: none;
}
.prof__pic{
    width: 2.865rem;
    height: 2.865rem;
}
</style>
