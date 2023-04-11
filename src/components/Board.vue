<script lang="js">
import {defineComponent} from "vue";
import board from "/public/Chess_Board.svg"

export default defineComponent({
    components: {board}
})
</script>
<template>
    <img src="/Chess_Board.svg" alt="Board" class="board">
</template>

<style scoped>
.board{
    position: relative;
    top:4.2rem;
    left: 24rem;
    width: 52rem;
}
</style>