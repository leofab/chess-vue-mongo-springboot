<template>
        <div class="sidebar">
            <ul>
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="48" height="48" viewBox="0 0 24 24"
                         style="fill: rgba(225, 225, 225, 1);transform: ;msFilter:;">
                        <path d="M21 2H3a1 1 0 0 0-1 1v18a1 1 0 0 0 1 1h18a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1zm-1 6h-4v4h4v4h-4v4h-4v-4H8v4H4v-4h4v-4H4V8h4V4h4v4h4V4h4v4z">
                        </path>
                        <path d="M8 8h4v4H8zm4 4h4v4h-4z"></path>
                    </svg>
                    Play</a>
                </li>
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="48" height="48" viewBox="0 0 24 24"
                         style="fill: rgba(225, 225, 225, 1);transform: ;msFilter:;">
                        <path d="M2 3h2v18H2zm18 0h2v18h-2zM5 13h2v1h2v-1h2v1h2v-1h4v1h2v-4h-2v1h-4v-1h-2v1H9v-1H7v1H5zm0-9v4h2V7h8v1h2V7h2V5h-2V4h-2v1H7V4zm0 13v3h2v-1h2v1h2v-1h8v-2h-8v-1H9v1H7v-1H5z">

                        </path></svg>
                    Learn</a></li>
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="48" height="48" viewBox="0 0 24 24"
                         style="fill: rgba(225, 225, 225, 1);transform: ;msFilter:;">
                        <path d="M21 4h-3V3a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1v1H3a1 1 0 0 0-1 1v3c0 4.31 1.799 6.91 4.819 7.012A6.001 6.001 0 0 0 11 17.91V20H9v2h6v-2h-2v-2.09a6.01 6.01 0 0 0 4.181-2.898C20.201 14.91 22 12.31 22 8V5a1 1 0 0 0-1-1zM4 8V6h2v6.83C4.216 12.078 4 9.299 4 8zm8 8c-2.206 0-4-1.794-4-4V4h8v8c0 2.206-1.794 4-4 4zm6-3.17V6h2v2c0 1.299-.216 4.078-2 4.83z">
                        </path>
                    </svg>
                    Rank</a></li>
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="48" height="48" viewBox="0 0 24 24"
                         style="fill: rgba(225, 225, 225, 1);transform: ;msFilter:;">
                        <path d="M3 13h1v7c0 1.103.897 2 2 2h12c1.103 0 2-.897 2-2v-7h1a1 1 0 0 0 .707-1.707l-9-9a.999.999 0 0 0-1.414 0l-9 9A1 1 0 0 0 3 13zm7 7v-5h4v5h-4zm2-15.586 6 6V15l.001 5H16v-5c0-1.103-.897-2-2-2h-4c-1.103 0-2 .897-2 2v5H6v-9.586l6-6z">
                        </path>
                    </svg>
                    Home</a></li>
            </ul>
            <ul class="side_login">
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="24" height="24" viewBox="0 0 24 24"
                         style="fill: rgba(0, 0, 0, 1);transform: ;msFilter:;">
                        <path d="M20 3H4c-1.103 0-2 .897-2 2v14c0 1.103.897 2 2 2h5v-2H4V7h16v12h-5v2h5c1.103 0 2-.897 2-2V5c0-1.103-.897-2-2-2z"></path><path d="M13 21v-5h3l-4-5-4 5h3v5z">
                    </path>
                    </svg>
                    Login</a></li>
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="24" height="24" viewBox="0 0 24 24"
                         style="fill: rgba(0, 0, 0, 1);transform: ;msFilter:;">
                        <path d="m7 17.013 4.413-.015 9.632-9.54c.378-.378.586-.88.586-1.414s-.208-1.036-.586-1.414l-1.586-1.586c-.756-.756-2.075-.752-2.825-.003L7 12.583v4.43zM18.045 4.458l1.589 1.583-1.597 1.582-1.586-1.585 1.594-1.58zM9 13.417l6.03-5.973 1.586 1.586-6.029 5.971L9 15.006v-1.589z"></path><path d="M5 21h14c1.103 0 2-.897 2-2v-8.668l-2 2V19H8.158c-.026 0-.053.01-.079.01-.033 0-.066-.009-.1-.01H5V5h6.847l2-2H5c-1.103 0-2 .897-2 2v14c0 1.103.897 2 2 2z">
                    </path>
                    </svg>
                    Sign In</a></li>
            </ul>
    </div>
  </template>
  
  <style scoped>
  a{
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
  .side_login{
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
    width: 200px;
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
  </style>
<script setup lang="ts">
</script>