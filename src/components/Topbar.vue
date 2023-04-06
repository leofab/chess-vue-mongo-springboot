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
  background-color: #fff;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  padding: 10px;
  display: flex;
  justify-content: flex-start;  
  align-items: center;
}

.topbar a {
  color: #333;
  text-decoration: none;
  font-size: 1.2rem;
  margin-right: 1rem;
}

.topbar a:hover {
  color: #555;
}
</style>





