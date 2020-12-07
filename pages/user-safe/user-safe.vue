<template>
	<view>
		<uni-list-item title="账号与安全" @click="open('changepassword')"></uni-list-item>
		<uni-list-item title="资料编辑"></uni-list-item>
		<uni-list-item title="账号与安全"></uni-list-item>
		<uni-list-item title="绑定QQ"></uni-list-item>
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
			open(path) {
				uni.navigateTo({
					url: `../${path}/${path}`
				});
			},
			
		}
	}
</script>

<style>

</style>
