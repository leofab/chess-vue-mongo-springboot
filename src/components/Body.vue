<template>
    <div class="body">
        <div class="body__header">
            <h1>Welcome to Chess VMSP</h1>
        </div>
        <div class="body__content">
            <Card>
                <template v-slot:header>
                    <h2>Card Title</h2>
                </template>
                <p>Card Content Goes Here</p>
                <template v-slot:footer>
                    <button>Click Me</button>
                </template>
            </Card>
        </div>
    </div>
</template>

<script>
import Card from './Card.vue'

export default {
    components: {
        Card
    },
    data() {
        return {
        }
    }
}
</script>
<style scoped>
.body {
    margin-left: 20rem;
    padding: 2.25rem;
    background-color: #868686;
    border-color: white;
    box-shadow: 2px 2px 4px #bebebe;

}

.body__header {
    padding: 0.825rem 0;
    background-color: #2f2f2f;
    color: #ececec;
    text-align: center;
    box-shadow: 0 2px 4px rgba(231, 228, 228, 0.1);

}

.body__header h1 {
    margin: 0;
    font-size: 2.625rem;
}

.body__content {
    margin-top: 0.825rem;
    padding: 0.825rem;
    font-size: 0.625rem;
}
</style>