<template>
  <div style="width:100%">
    <div class="index-body">
      <div class="table-head">交易详情</div>
      <div class="table-head" id="id">{{id}}</div>
      <div class="content">
        <div class="content-d">
          <span class="col_one">块高度</span>
          <span class="col_two">{{blockHeight}}</span>
        </div>
        <div class="content-d">
          <span class="col_one">区块ID</span>
          <span class="col_two">{{blockid}}</span>
        </div>
        <div class="content-d">
          <span class="col_one">交易类型</span>
          <span class="col_two">{{type}}</span>
        </div>
        <div class="content-d">
          <span class="col_one">时间</span>
          <span class="col_two">{{data}}</span>
        </div>
        <div class="content-d">
          <span class="col_one">发送者公钥</span>
          <span class="col_two">b314cee5ebcc992bc98a745754bd40608f653816826a1d522d6360bc28797128</span>
        </div>
        <div class="content-d">
          <span class="col_one">发送者地址</span>
          <span class="col_two">EJNf8rCeUBqx7edGzKHZnQ5BEuV6ZhwD3f</span>
        </div>
        <div class="content-d">
          <span class="col_one">接收者地址</span>
          <span class="col_two">ELzPRrXGDPirC6VdeiX2qpqgVyaA5k9Vdy</span>
        </div>
        <div class="content-d">
          <span class="col_one">交易金额</span>
          <span class="col_two">4986.89999999 EOK</span>
        </div>
        <div class="content-d">
          <span class="col_one">交易费</span>
          <span class="col_two">0.1 EOK</span>
        </div>
        <div class="content-d">
          <span class="col_one">交易签名</span>
          <span
            class="col_two"
          >c2770f9e168c8b38608a8e7c72624d0c13ba3248c48c4a59c3c1010f384a91d7ca8735515bc060d282d5bdedaca29b08828e32324dd7f4ab43396595ce40bb05</span>
        </div>
        <div class="content-d">
          <span class="col_one">节点签名</span>
          <span class="col_two"></span>
        </div>
        <div class="content-d">
          <span class="col_one">confirmations</span>
          <span class="col_two">63918</span>
        </div>
        <div class="content-d">
          <span class="col_one">其他参数</span>
          <span class="col_two"></span>
        </div>
        <div class="content-d">
          <span class="col_one">备注</span>
          <span class="col_two"></span>
        </div>
      </div>
    </div>
    <div class="footer">
      <template>
        <el-button @click="handleClick()" type="primary" size="small">返回</el-button>
      </template>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    id:{
      default: "01abd154813b24e81ba9737cf20675fb425e2f03a96757d395a00b9d65387315"
    },
    blockHeight: {
      default: "2778373"
    },
    blockid:{
      default: "7313158cbc122c720dd9a9110ce118c68192da6e87bfcd5c10d97ce4c2c7f22a"
    },
    type:{
      default: "存证"
    },
    data:{
      default: "2019年5月30 12:27:20"
    }
  },
  methods: {
    handleClick() {
      this.$router.push("/");
    }
  }
};
</script>

<style>
#app {
  font-family: Helvetica, sans-serif;
  text-align: center;
}
.index-body {
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}
.table-head {
  font-size: 120%;
  height: 40px;
  margin: 5px 0;
  font-size: 24px;
}
.table-body {
  margin: 30px 0;
  box-sizing: content-box;
}
.content {
  width: 90%;
  border-top: 1px solid #e9e9e9;
  margin: 0 auto;
}
.content-d {
  display: flex;
  align-items: center;
  height: 50px;
  border-bottom: 1px solid#e9e9e9;
  font-size: 0;
}
.col_one {
  width: 20%;
  float: left;
  font-size: 12px;
  text-indent: 1em;
  min-width: 100px;
}
.col_two {
  width: 80%;
  float: right;
  text-align: right;
  font-size: 12px;
  text-indent: 1em;
  word-wrap: break-word;
  padding-right: 10px;
}
.footer {
  margin: 5ch;
}
</style>
 
