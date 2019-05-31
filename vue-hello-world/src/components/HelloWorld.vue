<template>  
  <div style="width:100%" class="home">
    <div class="index-body">
      <div class="table-head">最新交易</div>
      <el-table :data="lastestTranscation" stripe style="width: 70%" class="table-body">
        <el-table-column fixed prop="id" label="交易ID" width="150"></el-table-column>
        <el-table-column prop="type" label="交易类型" width="120"></el-table-column>
        <el-table-column prop="initator" label="发起者" width="120"></el-table-column>
        <el-table-column prop="recivier" label="接受者" width="120"></el-table-column>
        <el-table-column prop="tranAmount" label="交易金额" width="120"></el-table-column>
        <el-table-column prop="tranFei" label="交易费" width="120"></el-table-column>
        <el-table-column prop="blockHeight" label="块高度" width="120"></el-table-column>
        <el-table-column fixed="right" label="操作" width="100">
          <template slot-scope="scope">
            <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>
    <div class="index-body">
      <div class="table-head">最新区块</div>
      <el-table :data="lastestBlock" stripe style="width: 70%" class="table-body">
        <el-table-column fixed prop="id" label="区块ID" width="150"></el-table-column>
        <el-table-column prop="blockHeight" label="区块高度" width="120"></el-table-column>
        <el-table-column prop="amount" label="交易数" width="120"></el-table-column>
        <el-table-column prop="jiangeok" label="锻造奖励(EOK)" width="120"></el-table-column>
        <el-table-column prop="eeok" label="总金额(EOK)" width="120"></el-table-column>
        <el-table-column prop="feieok" label="总费用(EOK)" width="120"></el-table-column>
        <el-table-column prop="address" label="锻造者地址" width="120"></el-table-column>
        <el-table-column prop="data" label="日期" width="120"></el-table-column>

      </el-table>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
import { NewBlock,UserQryAction, UserAddAction, UserDelAction, UserUpdateAction } from "../api/user.js";
export default {
  name:"HelloWorld",
  methods: {
    handleClick() {
        this.$router.push('Detail')
        
    },
    UserQry() {
        UserQryAction().then(res => {
          this.lastestTranscation = res.data;
        });
      },
    getNewBlock(){
       NewBlock().then(res =>{
         this.lastestBlock = res.data;
       });
    }
  },

  data() {
    return {
      lastestTranscation: [
        {
          id: "01abd154813b24e81ba9737cf20675fb425e2f03a96757d395a00b9d65387315",
          type: "存证",
          initator: "EJNf8rCeUBqx7edGzKHZnQ5BEuV6ZhwD3f",
          recivier: "",
          tranAmount: "0",
          tranFei: "0.1",
          blockHeight: "2773209"
        },
        {
          id: "21616a99772363a3bc436a7e2c6e12fda7b0fc48a3bcb2530568ff8a95b184d9",
          type: "存证",
          initator: "EL47zz229ia5sdZaaNwKjtNdgzT8dV5qAa",
          recivier: "",
          tranAmount: "0",
          tranFei: "0.1",
          blockHeight: "2770444"
        },
        {
          id: "21616a99772363a3bc436a7e2c6e12fda7b0fc48a3bcb2530568ff8a95b184d9",
          type: "存证",
          initator: "ELzPRrXGDPirC6VdeiX2qpqgVyaA5k9Vdy",
          recivier: "",
          tranAmount: "0",
          tranFei: "0.1",
          blockHeight: "2681233"
        }
      ],
      lastestBlock: [
        {
          id: "7313158cbc122c720dd9a9110ce118c68192da6e87bfcd5c10d97ce4c2c7f22a",
          blockHeight: "2822726",
          amount: "0",
          jiangeok: "10",
          eeok: "0",
          address: "EAGjqVRpD3Q1frzxxQbzcJR31Wqvtx7uNk",
          feieok: "0",
          date: "2019年5月30 12:27:30"
        },
        {
          id: "c122aac1fc20bd1ea8643c18d1c446e857c2811cf07a3d9b459f26b9498b99d4",
          blockHeight: "2822725",
          amount: "0",
          jiangeok: "10",
          eeok: "0",
          address: "EkD4PoF3DZy1hiFVU28PBaGYakmh1w2Zm",
          feieok: "0",
          date: "2019年5月30 12:27:20"
        },
        {
          id: "f07e1f324c269f5f9fd9bdd234ab2d3c0c9086c883b0485cccd8308bd5b8e952",
          blockHeight: "2822724",
          amount: "0",
          jiangeok: "10",
          eeok: "0",
          address: "EAGjqVRpD3Q1frzxxQbzcJR31Wqvtx7uNk",
          feieok: "0",
          date: "2019年5月30 12:27:10"
        },
        {
          id: "3f9392a9967b683fdd12664e5cbc7968d2b8f64658ed20d93c13926740da60e8",
          blockHeight: "2822723",
          amount: "0",
          jiangeok: "10",
          eeok: "0",
          address: "E3JPFZJqQuwB2V1qb1x6fKufzoSc1wN8kM",
          feieok: "0",
          date: "2019年5月30 12:27:00"
        }
      ]
    };
  },
  mounted(){
    this.UserQry(),
    this.getNewBlock()
  }
  

};
</script>

<style>
#home{
  font-size: 130%;
  height: 40px;
  margin-top: 19ch;
  font-size: 24px;
}
#app {
  font-family: Helvetica, sans-serif;
  text-align: center;
}
.index-body{
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}
.table-head {
  font-size: 130%;
  height: 40px;
  margin: 5px 0;
  font-size: 24px;
}
.table-body {
  margin: 30px 0;
  box-sizing: content-box;
  box-shadow:0 0 8px rgb(170, 169, 169);
  border-radius: 1ch;

}
.table-body:hover{
  box-shadow:0 0 10px rgb(136, 135, 135);
  border-radius: 1ch;
}
</style>
 
