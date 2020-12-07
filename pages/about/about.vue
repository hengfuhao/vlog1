<template>
	<view>
	<view class="text-center pt-5">
		<image 
			src="../../static/common/nothing.png"
			mode="aspectFill"
			style="border-radius: 150rpx; width: 200rpx;height: 200rpx; "
			class="text-center"></image>
			</view>
			<input type="text" placeholder="version1.1.0" class="font-small text-center"/>
				<uni-list-item title="新版本检测"></uni-list-item>
				<uni-list-item title="社区用户协议"></uni-list-item>
	
	</view>
</template>

<script>
import uniListItem from "@/components/uni-ui/uni-list-item/uni-list-item.vue";
	import { mapState } from 'vuex';
	export default {
		components: {
			uniListItem
		},
		data() {
			return {
				
			}
		},
		methods: {
			
		}
	}
</script>

<style>

</style>
