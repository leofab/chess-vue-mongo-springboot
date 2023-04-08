<template>
    <div class="login-container">
        <div class="login-overlay"></div>
        <div class="login-card">
            <Card>
                <h2>Login Form</h2>
                <form>
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username">
                    <br>
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password">
                    <br>
                    <button type="submit">Login</button>
                </form>
            </Card>
        </div>
    </div>
</template>

<script>
import Card from './Card.vue';

export default {
    components: {
        Card,
    },
}
</script>

<style scoped>
.login-container {
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
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background-color: rgba(0, 0, 0, 0.5);
    backdrop-filter: blur(5px);
    z-index: 10;
}

.login-card {
    position: relative;
    z-index: 20;
}
</style>
