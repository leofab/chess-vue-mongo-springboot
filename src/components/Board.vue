<script lang="js">
import BoardSVG from "../assets/Chess_Board.svg?component"

export default {
    components:{
        BoardSVG
    }

}
</script>
<template>
    <BoardSVG class="board"/>
</template>

<style scoped>
.board{
    top: 5rem;
    width: 52rem;
    height: 52rem;
    position: relative;
    left: 20rem;
}
</style>