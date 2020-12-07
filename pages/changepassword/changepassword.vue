<template>
	<view>
		<view class="mb-2">
			<input type="text" v-model="password" placeholder="输入新密码" class="border-bottom p-2"/>
		</view>
		<view class="mb-2">
			<input type="text" v-model="password" placeholder="输入确认密码" class="border-bottom p-2"/>
		</view>
		<view class="py-2 px-3">
			<button class="bg-main text-white"
			 style="border-radius: 50rpx; border: 0;"
			 type="primary"
			 :disabled="disabled"
			 :class="disabled ? 'bg-main-disabled':'bg-main'"
			 @click="submit"
			 :loading="loading">
			 设置
			 </button>
		</view>
		
	</view>
</template>

<script>
	import uniListItem from '@/components/uni-ui/uni-list-item/uni-list-item.vue';
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
