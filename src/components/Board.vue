<script lang="js">
import BoardSVG from "../assets/Chess_Board.svg"

export default {
    components:{
        BoardSVG
    }

}
</script>
<template>
    <BoardSVG/>
</template>

<style scoped>
.board{
    position: relative;
    top:4.2rem;
    left: 24rem;
    width: 52rem;
}
</style>