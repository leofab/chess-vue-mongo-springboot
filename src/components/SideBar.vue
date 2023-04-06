<template>
    <div class="sidebar">
      <ul>
        <li><a href="#"><svg xmlns="http://www.w3.org/2000/svg"
                             width="48" height="48" viewBox="0 0 24 24"
                             style="fill: rgba(225, 225, 225, 1);transform: ;msFilter:;">
            <path d="M21 2H3a1 1 0 0 0-1 1v18a1 1 0 0 0 1 1h18a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1zm-1 6h-4v4h4v4h-4v4h-4v-4H8v4H4v-4h4v-4H4V8h4V4h4v4h4V4h4v4z">
            </path>
            <path d="M8 8h4v4H8zm4 4h4v4h-4z"></path>
        </svg>
            Play</a>
        </li>
        <li><a href="#">Menu item 2</a></li>
        <li><a href="#">Menu item 3</a></li>
        <li><a href="#">Menu item 4</a></li>
      </ul>
    </div>
  </template>
  
  <style scoped>
  a{
      display: flex;
      flex-direction: column;
      justify-items: auto;
  }
  .sidebar {
    position: fixed;
    right: 0;
    bottom: 0;
    width: 200px;
    background-color: #2f2f2f;
    color: #fff;
    padding: 70px 10px 10px 50px;
  }
  
  .sidebar ul {
    list-style: none;
    margin: 0;
    padding: 0;
  }
  
  .sidebar li {
    margin-bottom: 10px;
  }
  
  .sidebar a {
    color: #fff;
    text-decoration: none;
  }
  </style>
