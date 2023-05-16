<script lang="js">
import BoardSVG from "../assets/Chess_Board.svg?component"
import Square from "../assets/noun-square-5656370.svg?component"
import Pawn from "../assets//whitepieces/noun-pawn-1823090.svg?component"
import Bishop from "../assets/whitepieces/noun-bishop-1823093.svg?component"
import Rook from "../assets/whitepieces/noun-rook-1823091.svg?component"
import Knight from "../assets/whitepieces/noun-knight-1823092.svg?component"
import Queen from "../assets/whitepieces/noun-queen-1823094.svg?component"
import King from "../assets/whitepieces/noun-king-1823095.svg?component"

export default {
    components:{
        BoardSVG,
        Square,
        Pawn,
        Bishop,
        Rook,
        Knight,
        Queen,
        King
    }

}
</script>
<template>
    <BoardSVG class="board" />

    <Square class="square_tw_18"/>
    <Square class="square_nw_17"/>
    <Square class="square_bw_16"/>
    <Square class="square_kw_15"/>
    <Square class="square_qw_14"/>
    <Square class="square_bw_13"/>
    <Square class="square_nw_12"/>
    <Square class="square_tw_11"/>

    <Square class="square_pw_28">

    </Square>
    <Square class="square_pw_27"/>
    <Square class="square_pw_26"/>
    <Square class="square_pw_25"/>
    <Square class="square_pw_24"/>
    <Square class="square_pw_23"/>
    <Square class="square_pw_22"/>
    <Square class="square_pw_21"/>

    <Square class="square__38"/>
    <Square class="square__37"/>
    <Square class="square__36"/>
    <Square class="square__35"/>
    <Square class="square__34"/>
    <Square class="square__33"/>
    <Square class="square__32"/>
    <Square class="square__31"/>

    <Square class="square__48"/>
    <Square class="square__47"/>
    <Square class="square__46"/>
    <Square class="square__45"/>
    <Square class="square__44"/>
    <Square class="square__43"/>
    <Square class="square__42"/>
    <Square class="square__41"/>

    <Square class="square__58"/>
    <Square class="square__57"/>
    <Square class="square__56"/>
    <Square class="square__55"/>
    <Square class="square__54"/>
    <Square class="square__53"/>
    <Square class="square__52"/>
    <Square class="square__51"/>

    <Square class="square__68"/>
    <Square class="square__67"/>
    <Square class="square__66"/>
    <Square class="square__65"/>
    <Square class="square__64"/>
    <Square class="square__63"/>
    <Square class="square__62"/>
    <Square class="square__61"/>

    <Square class="square_pb_78"/>
    <Square class="square_pb_77"/>
    <Square class="square_pb_76"/>
    <Square class="square_pb_75"/>
    <Square class="square_pb_74"/>
    <Square class="square_pb_73"/>
    <Square class="square_pb_72"/>
    <Square class="square_pb_71"/>

    <Square class="square_tb_88"/>
    <Square class="square_nb_87"/>
    <Square class="square_bb_86"/>
    <Square class="square_qb_85"/>
    <Square class="square_kb_84"/>
    <Square class="square_bb_83"/>
    <Square class="square_nb_82"/>
    <Square class="square_tb_81"/>


    <Pawn style="fill: cornsilk;" class="square_pw_28"/>

    <Pawn style="
    fill: cornsilk;
    " class="square_pw_27"/>

    <Pawn style="
    fill: cornsilk;
    " class="square_pw_26"/>

    <Pawn style="
    fill: cornsilk;
    " class="square_pw_25"/>

    <Pawn style="
    fill: cornsilk;
    " class="square_pw_24"/>

    <Pawn style="
    fill: cornsilk;
    " class="square_pw_23"/>

    <Pawn style="
    fill: cornsilk;
    " class="square_pw_22"/>

    <Pawn style="
    fill: cornsilk;
    " class="square_pw_21"/>

    <Bishop style="
    fill: cornsilk;
    " class="square_bw_13"/>

    <Bishop style="
    fill: cornsilk;
    " class="square_bw_16"/>

    <Knight style="
    fill: cornsilk;
    " class="square_nw_12"/>

    <Knight style="
    fill: cornsilk;
    " class="square_nw_17"/>

    <Rook style="
    fill: cornsilk;
    " class="square_tw_18"/>

    <Rook style="
    fill: cornsilk;
    " class="square_tw_11"/>

    <Queen style="
    fill: cornsilk;
    " class="square_qw_14"/>

    <King style="
    fill: cornsilk;
    " class="square_kw_15"/>

    <Pawn style="
    fill: gold;
    " class="square_pb_78"/>

    <Pawn style="
    fill: gold;
    " class="square_pb_77"/>

    <Pawn style="
    fill: gold;
    " class="square_pb_76"/>

    <Pawn style="
    fill: gold;
    " class="square_pb_75"/>

    <Pawn style="
    fill: gold;
    " class="square_pb_74"/>

    <Pawn style="
    fill: gold;
    " class="square_pb_73"/>

    <Pawn style="
    fill: gold;
    " class="square_pb_72"/>

    <Pawn style="
    fill: gold;
    " class="square_pb_71"/>

    <Bishop style="
    fill: gold;
    " class="square_bb_83"/>

    <Bishop style="
    fill: gold;
    " class="square_bb_86"/>

    <Knight style="
    fill: gold;
    " class="square_nb_82"/>

    <Knight style="
    fill: gold;
    " class="square_nb_87"/>

    <Rook style="
    fill: gold;
    " class="square_tb_88"/>

    <Rook style="
    fill: gold;
    " class="square_tb_81"/>

    <King style="
    fill: gold;
    " class="square_kb_85"/>

    <Queen style="
    fill: gold;
    " class="square_qb_84"/>

</template>

<style scoped>
.board{
    top: 7rem;
    width: 51.6rem;
    height: 51.6rem;
    position: fixed;
    left: 21rem;
    opacity: 20%;
}
.square_tw_18{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:517px;
}
.square_nw_17{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:517px;
}
.square_bw_16{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:517px;
}
.square_kw_15{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:517px;
}
.square_qw_14{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:517px;
}
.square_bw_13{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:517px;
}
.square_nw_12{
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
.square_pw_28{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:453px;
}
.square_pw_27{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:453px;
}
.square_pw_26{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:453px;
}
.square_pw_25{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:453px;
}
.square_pw_24{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:453px;
}
.square_pw_23{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:453px;
}
.square_pw_22{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 263px;
    top:453px;
}
.square_pw_21{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 199px;
    top:453px;
}
.square__38{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:389px;
}
.square__37{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:389px;
}
.square__36{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:389px;
}
.square__35{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:389px;
}
.square__34{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:389px;
}
.square__33{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:389px;
}
.square__32{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 263px;
    top:389px;
}
.square__31{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 199px;
    top:389px;
}
.square__48{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:325px;
}
.square__47  {
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:325px;
}
.square__46{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:325px;
}
.square__45{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:325px;
}
.square__44{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:325px;
}
.square__43{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:325px;
}
.square__42{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 263px;
    top:325px;
}
.square__41{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 199px;
    top:325px;
}
.square__58{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:261px;
}
.square__57{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:261px;
}
.square__56{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:261px;
}
.square__55{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:261px;
}
.square__54{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:261px;
}
.square__53{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:261px;
}
.square__52{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 263px;
    top:261px;
}
.square__51{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 199px;
    top:261px;
}
.square__68{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:197px;
}
.square__67{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:197px;
}
.square__66{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:197px;
}
.square__65{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:197px;
}
.square__64{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:197px;
}
.square__63{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:197px;
}
.square__62{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 263px;
    top:197px;
}
.square__61{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 199px;
    top:197px;
}
.square_pb_78{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:133px;
}
.square_pb_77{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:133px;
}
.square_pb_76{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:133px;
}
.square_pb_75{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:133px;
}
.square_pb_74{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:133px;
}
.square_pb_73{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:133px;
}
.square_pb_72{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 263px;
    top:133px;
}
.square_pb_71{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 199px;
    top:133px;
}
.square_tb_88{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 647px;
    top:69px;
}
.square_nb_87{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 583px;
    top:69px;
}
.square_bb_86{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 519px;
    top:69px;
}
.square_kb_85{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 455px;
    top:69px;
}
.square_qb_84{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 391px;
    top:69px;
}
.square_bb_83{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 327px;
    top:69px;
}
.square_nb_82{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 263px;
    top:69px;
}
.square_tb_81{
    width: 90px;
    height: 90px;
    position: fixed;
    left: 199px;
    top:69px;
}
</style>