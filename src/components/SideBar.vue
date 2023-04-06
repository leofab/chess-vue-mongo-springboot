<template>
    <div class="sidebar">
      <ul>
        <li><a href="#">Menu item 1</a></li>
        <li><a href="#">Menu item 2</a></li>
        <li><a href="#">Menu item 3</a></li>
        <li><a href="#">Menu item 4</a></li>
      </ul>
    </div>
  </template>
  
  <style scoped>
  .sidebar {
    position: fixed;
    right: 0;
    bottom: 0;
    width: 200px;
    background-color: #2f2f2f;
    color: #fff;
    padding: 20px;
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
  