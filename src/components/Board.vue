<script lang="js">
import BoardSVG from "../assets/Chess_Board.svg?component"
import Square from "../assets/noun-square-5656370.svg?component"

export default {
    components:{
        BoardSVG,
        Square
    }

}
</script>
<template>
    <BoardSVG class="board" />


    <Square class="square_tw_18"/>
    <Square class="square_tw_17"/>
    <Square class="square_tw_16"/>
    <Square class="square_tw_15"/>
    <Square class="square_tw_14"/>
    <Square class="square_tw_13"/>
    <Square class="square_tw_12"/>
    <Square class="square_tw_11"/>


</template>

<style scoped>
.board{
    top: 5rem;
    width: 52rem;
    height: 52rem;
    position: relative;
    left: 20rem;
    opacity: 20%;
}
.square_tw_18{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:517px;
}
.square_tw_17{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:517px;
}
.square_tw_16{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:517px;
}
.square_tw_15{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:517px;
}
.square_tw_14{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:517px;
}
.square_tw_13{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:517px;
}
.square_tw_12{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 263px;
    top:517px;
}
.square_tw_11{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 199px;
    top:517px;
}
</style>