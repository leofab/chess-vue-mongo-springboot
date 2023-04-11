
<template>
    <div class="login-container">
        <div class="login-overlay"></div>
        <div class="login-card">
                <h2>Login</h2>
                <form>
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username">
                    <br>
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password">
                    <br>
                    <button type="submit">Login</button>
                    <GoogleLogin />>
                </form>
        </div>
    </div>
</template>

<script>
import Card from './Card.vue';


export default {
    components: {
        Card
    }
}
</script>

<style scoped>
.login-container {
    color: #2f2f2f;
    font-size: 6rem;
    position: fixed;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    display: flex;
    justify-content: center;
    align-items: center;
}

.login-overlay {
    position: fixed;
    width: 34rem;
    height: 43rem;
    border-radius: 1rem;
    background-color: rgb(239, 235, 235);
    backdrop-filter: blur(5px);
    z-index: 10;
}

.login-card {
    width: 5rem;
    position: relative;
    bottom: 9rem;
    z-index: 20;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
}
</style>
