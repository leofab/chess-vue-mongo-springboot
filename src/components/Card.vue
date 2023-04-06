<template>
    <div class="card">
        <div class="card__header">
            <slot :name="header"></slot>
        </div>
        <div class="card__body">
            <slot></slot>
        </div>
        <div class="card__footer">
            <slot :name="footer"></slot>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            header: 'default message from Child!',
            footer: 'default message from Footer!'
        }
    }
}
</script>
<style scoped>
.card {
    background-color: #fff;
    border-radius: 4px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    margin-bottom: 20px;
    padding: 20px;
}
.card__header {
    font-size: 18px;
    font-weight: bold;
    color: #2f2f2f;
    margin-bottom: 10px;
}
.card__footer {
    margin-top: 10px;
    text-align: right;
}
</style>
