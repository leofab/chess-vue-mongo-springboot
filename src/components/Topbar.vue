<template>
    <div class="topbar">
      <div class="topbar__logo"></div>
        <nav class="topbar__nav">
            <ul>
              <li><a href="#">Chess VMSP</a></li>
              <li><a href="#">Home</a></li>
              <li><a href="#">About</a></li>
              <li><a href="#">Contact</a></li>
            </ul>
            <ul class="right_nav">
              <li><a href="#">Login</a></li>
              <li><a href="#">Register</a></li>
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
  background-color: #2f2f2f;
  box-shadow: 0 2px 4px rgba(231, 229, 229, 0.1);
  padding: 10px;
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
}
.topbar__logo {
  color: #8c8b8b;
  text-decoration: none;
  font-size: 1.2rem;
  padding-right: 1em;
}


.topbar__nav {
  display: flex;
}

.topbar__nav a:hover {
  width: 2em;
  color: #555;
  flex: 1;
}
.topbar__nav ul {
  list-style: none;
  margin: 0;
  display: flex;
}
.topbar__nav ul:first-of-type {
  margin-left: auto;
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





