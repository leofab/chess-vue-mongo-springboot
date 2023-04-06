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
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  background-color: #000;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  padding: 10px;
  display: flex;
}

.topbar_logo a {
  color: #333;
  text-decoration: none;
  font-size: 1.2rem;
  margin-right: 1rem;
}

.topbar_nav a:hover {
  width: 2em;
  color: #555;
  display: flex;
  align-items: center;
  justify-content: flex-start;
  flex: 1;
}
.topbar__nav ul {
  list-style: none;
  margin: 0;
  padding: 0;
  display: flex;
}

.topbar__nav li {
  margin-left: 20px;
}

.topbar__nav a {
  color: #fff;
  text-decoration: none;
  font-size: 16px;
}
</style>





