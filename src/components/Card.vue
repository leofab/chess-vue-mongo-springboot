<template>
    <div class="card">
        <div class="card__header">
            <slot name="header"></slot>
        </div>
        <div class="card__body">
            <slot></slot>
        </div>
        <div class="card__footer">
            <slot name="footer"></slot>
        </div>
    </div>
</template>

<style scoped>
.card {
    font-size: 3.185rem;
    background-color: #fff;
    border-radius: 4px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    margin-bottom: 1.25rem;
    padding: 4.55rem;
    display: flex;
    flex-direction: column;
}
.card__header {
    font-size: 1.8rem;
    font-weight: bold;
    margin-bottom: 1rem;
}
.card__footer {
    margin-top: 6.225rem;
    text-align: center;
}
</style>