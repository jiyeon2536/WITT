import RecentItem, { RecentItemType } from './RecentItem'

/*
  최근 검색은 최근 검색어, 최근 본 유저 순으로 표시된다.
  localStorage에 각각 저장해두고 검색어와 유저 각 순서대로 표시하기
*/

interface RecentSearchProp {
	recentKeywords: string[]
}
const RecentSearch = ({recentKeywords}: RecentSearchProp) => {
	
	return (
		<div className="flex flex-col pt-3">
			<h3 className="text-base">최근 검색</h3>
			<ul className="flex flex-col px-3 pt-2">
				{recentKeywords.length &&
					recentKeywords.map((keyword) => (
						<li key={keyword} className="flex items-center gap-3 justify-between py-2">
							<RecentItem type={RecentItemType.KEYWORD} keyword={keyword} />
						</li>
					))}
			</ul>
		</div>
	)
}

export default RecentSearch
