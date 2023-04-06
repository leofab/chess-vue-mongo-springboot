<template>
    <div class="topbar">
      <div class="topbar__logo">My Site</div>
      <nav class="topbar__nav">
        <ul>
          <li><a href="#">Home</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </nav>
    </div>
  </template>
  
  <style scoped>
    .topbar {
      display: flex;
      justify-content: space-between;
      align-items: center;
      background-color: white;
      box-shadow: 0px 2px 6px rgba(0, 0, 0, 0.1);
      padding: 0.5rem 1rem;
    }
    .topbar__logo {
      font-weight: bold;
      font-size: 1.5rem;
    }
    .topbar__nav ul {
      display: flex;
      list-style: none;
      margin: 0;
      padding: 0;
    }
    .topbar__nav li:not(:last-child) {
      margin-right: 1rem;
    }
    .topbar__nav a {
      color: #333;
      text-decoration: none;
      transition: color 0.2s;
    }
    .topbar__nav a:hover {
      color: #646cff;
    }
  </style>